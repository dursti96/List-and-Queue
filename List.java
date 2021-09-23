public class List {

    private int size;
    private ListElements start;
    private ListElements end;


    // Konstruktor liste

    public List(){
        start = new ListElements();
        end = new ListElements();
        start.next = end;
        end.previous = start;
        size = 0;
    }


    public void add(Integer element) {       // add at end of list

        ListElements speicher1 = end.previous;
        ListElements speicher2 = end.previous.next;

        ListElements newElement = new ListElements(element);

        end.previous.next = newElement;
        end.previous = newElement;

        newElement.previous = speicher1;
        newElement.next = speicher2;

        size++;


    }


    public boolean isEmpty(){

        if(size == 0){
            return true;
        }
        else{
            return false;
        }

    }

    public int size(){
        return size;
    }


    public void clear(){

        start.next = end;
        end.previous = start;

    }


    public void addAll(List liste){

        for(int i = 0; i < liste.size; i++){

            add(liste.get(i));

        }

    }


    public Integer get(int index){

        ListElements a = start.next;

        for(int i = 0; i < index; i++){

            a = a.next;

        }

        return a.element;

    }

    private ListElements getElement(int index){

        ListElements a = start.next;

        for(int i = 0; i < index; i++){

            a = a.next;

        }

        return a;

    }

    public void remove(int index){

        ListElements a = getElement(index).next;

        getElement(index).next.previous = getElement(index).previous;

        getElement(index-1).next = a;

        size--;

    }



    public void reverse(){

        ListElements speicher2;             // speicher für tauschen von start, end

        for(int i = 0; i < size; i++){

            if(i==0){
                speicher2 = start.next;
                start.next = end.previous;
                end.previous = speicher2;
            }

            ListElements speicher1 = getElement(i).next;
            getElement(i).next = getElement(i).previous;
            getElement(i).previous = speicher1;



        }


    }




}
