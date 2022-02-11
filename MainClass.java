public class MainClass {

    public static void main(String[] args) {


/*
        Queue queue1 = new Queue();

        queue1.add(5);
        queue1.add(3);
        queue1.add(2);

        System.out.println(queue1.peek());
        System.out.println("Size " + queue1.getSize());

        System.out.println(queue1.poll());
        System.out.println("Size " + queue1.getSize());
        System.out.println(queue1.poll());
        System.out.println("Size " + queue1.getSize());
        System.out.println(queue1.peek());
        System.out.println("Size " + queue1.getSize());


*/







        System.out.println("\n");



        List liste1 = new List();
        List liste2 = new List();

        liste1.add(53);
        liste1.add(5);
        liste1.add(28);
        liste1.add(33);
        liste1.add(77);

        System.out.println(liste1.remove(-1));
        System.out.println(liste1.remove(0));
        System.out.println(liste1.remove(4));

        System.out.println("\n");

        System.out.println(liste1.get(-1));
        System.out.println(liste1.get(0));
        System.out.println(liste1.get(1));
        System.out.println(liste1.get(2));
        System.out.println(liste1.get(3));
        System.out.println(liste1.get(4));

        System.out.println("\n");

        liste2.add(1);
        liste2.add(2);
        liste2.add(3);
        liste2.add(4);

        liste1.addAll(liste2);


        for(int i = 0; i < liste1.size(); i++){

            System.out.println(liste1.get(i));

        }

        System.out.println("\n");

        liste1.reverse();


        for(int i = 0; i < liste1.size(); i++){

            System.out.println(liste1.get(i));

        }




    }

}
