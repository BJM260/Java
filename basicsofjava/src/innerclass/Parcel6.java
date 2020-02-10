package innerclass;

public class Parcel6 {
    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSlip(){
                    return id;
                }
            }

            TrackingSlip trackingSlip = new TrackingSlip("wolf");
            String string = trackingSlip.getSlip();
        }
    }

    public void track(){
        internalTracking(true);
    }

    public static void main(String[] args){
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();
    }
}
