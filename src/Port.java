public class Port {
    Hub hub1 = new Hub();
    Hub hub2 = new Hub();
    Hub hub3 = new Hub();

    public Port() {
    }
    String markCheckLessEqual(int toCompare,int hubNumber){
        String info ="There seems to be an error in the hub number.";
        if (hubNumber == 1){
            info = hub1.markCheckLessEqual(toCompare);
        }
        if (hubNumber == 2){
            info = hub2.markCheckLessEqual(toCompare);
        }
        if (hubNumber == 3){
            info = hub3.markCheckLessEqual(toCompare);
        }
        return info;
    }
}
