class pizza{
    int veg=300;
    int non_veg=400;
    int extra_cheese=100;
    int extra_toppings=200;
    int take_away=20;

    int price;
    boolean isveg;

    public pizza(boolean isveg) {
        if (this.isveg){
            this.price=300;
            System.out.println("normal veg pizza "+ this.price );
        }
        else {
            this.price=400;
            System.out.println("normal non veg pizza "+ this.price);
        }
    }

    public void extracheese(){
        System.out.println(" with extra cheese added:"+extra_cheese );
        this.price=extra_cheese+this.price;

    }

    public void extratopping(){
        this.price=extra_toppings+this.price;
        System.out.println("with extra toppings added:"+extra_toppings);
    }

    public void takeaway(){
        int takeaway=20;
        this.price=takeaway+this.price;
        System.out.println("with take away service:"+takeaway);
    }

    public void getbill(){
        System.out.println("total bill:"+this.price);
    }


}