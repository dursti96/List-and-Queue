public class QueueElements {

    public QueueElements previous;
    public Integer element;


    public QueueElements(QueueElements previous, Integer element){

        this.previous = previous;
        this.element = element;

    }

    public QueueElements(Integer element){

        this.element = element;

    }


}
