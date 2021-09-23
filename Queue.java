public class Queue {

    private QueueElements start;
    private QueueElements end;
    private int size;



    public Queue(){             // Konstruktor

        start = new QueueElements(null, null);
        end = new QueueElements(start, null);

        size = 0;

    }


    public void add(Integer element){

        QueueElements newelement = new QueueElements(element);

        newelement.previous = end.previous;
        end.previous = newelement;

        size++;

    }

    public Integer peek(){

        QueueElements a = end.previous;     // nach schleife a == erstes element;

        for(int i = 0; i < size-1; i++){

            a = a.previous;

        }

        return a.element;

    }


    public Integer poll(){

        QueueElements a = end;          // nach schleife a == zweites element;


        for(int i = 0; i < size-1; i++){

            a = a.previous;

        }

        QueueElements returnElement = a.previous;       // == erstes element;

        a.previous = start;

        size--;

        return returnElement.element;

    }

    public int getSize(){

        return size;

    }






    




}
