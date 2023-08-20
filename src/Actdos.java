public class Actdos {
    public static void main(String[] args) {

        int[] numerozz= new int [args.length-1];

        int x= Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {

            numerozz[i-1] =Integer.parseInt(args[i]);
        }

        boolean resulta2= false;

        for (int i = 0; i < numerozz.length; i++) {
            for (int j = 0; j < numerozz.length; j++) {
                if (numerozz[i] + numerozz[j]== x){
                    resulta2=true;

                    break;
                }
            }
            if (resulta2){
                break;
            }
        }
        if (resulta2==true){
            System.out.println("Sí");
        }else {
            System.out.println("No da");
        }


    }
}
