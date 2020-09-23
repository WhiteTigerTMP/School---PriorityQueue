import java.util.*;

class PrioQueue<ContentType>{

  ArrayList<ContentType> sorted = new ArrayList<ContentType>();
  ArrayList<ContentType> queueList = new ArrayList<ContentType>();
    
  public void queue(ContentType e){
    queueList.add(e);                           // add a new number in unsorted queue
    sortQueue(queueList);                       // sort that queue and place it in sorted arraylist
    queueList = sorted;                         // replace the unsorted queue with sorted queue
  }     

  private void sortQueue(ArrayList<ContentType> list){
    int index = list.size();
    for (int i = 0; i<index; i++){
      while(!list.isEmpty()){
        ContentType smallest = list.get(0);
        for(ContentType x : list ){
          if (x.toString().compareTo(smallest.toString()) < 0) {
            smallest = x;
          }
        } 
        list.remove(smallest);
        sorted.add(smallest);
      } 
    } 
  }
  
  public Integer getSizeQueue(){
    return queueList.size();           // get the size of queue as Integer
  }                                                              
    
  public ContentType getActualQueue(){
    return queueList.get(0);          // get the first object in queue as ContentObject
  }
  
  public ContentType getLastQueue(){
    return queueList.get(queueList.size());     //get the last object in queue as ContentObject
  }
  
  public Integer getPlaceInQueue(ContentType e){
    return queueList.indexOf(e);               //search a specific place in queue of an object by getting an int of its position
  }
  
  public ContentType enqueue(){
    ContentType object;
    object = queueList.get(0);
    queueList.remove(0); 
    return object;                            //return first object in queue and remove it from there
  }
  
}
