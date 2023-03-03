public class deal_pizza extends pizza{
    int price;

    public deal_pizza(boolean isveg) {
        super(isveg);
        if (isveg){

            super.extracheese();
            super.extratopping();
            super.takeaway();
            super.getbill();
        }
        else {

            super.extracheese();
            super.extratopping();
            super.takeaway();
            super.getbill();
        }
    }

    @Override
    public void extracheese() {

    }

    @Override
    public void extratopping() {

    }
}
