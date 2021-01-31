// Coderpad: given an array scores [][] = {“jerry”,”65”},{“bob”,”91”}, {“jerry”,”23”}, {“Eric”,”83”}} Find the student with highest average score


public String[][] getFive()
{
 
  String[][] details={{“jerry”,”65”},{“bob”,”91”}, {“jerry”,”23”}, {“Eric”,”83”}};
  
  HashMap<String,PriorityQueue<Long>> set=new HashMap();
  long totalAverage=0;
  StringBuilder name=new StringBuilder();
  
  for(String[] score: details)
  {
   
    if(set.containsKey(score[0]))
    {
      PriorityQueue pq=set.get(score[0]);
      pq.offer(score[1]);
      if(pq.size()>5)
      {
        pq.poll();
      }
      set.put(score[0], pq);
    }
    else
    {
      PriorityQueue<Long> pq=new PriorityQueue();
      pq.offer(score[1]);
      pq.put(score[0],score[1]);
      
    }
        
  }
  
  for(Map.Entry mapele: set.entrySet())
  {
    
    long avg=getAverage(mapele.getValue());
    
    if(avg>totalAverage)
    {
      name=mapele.getKey();
      totalAverage=avg;
    }
  }
  result[0][0] = name.toString();
  result[0][1] = String.valueOf(totalAverage);
  return result;
  
}

public long getAverage(PriorityQueue<Integer> pq)
{
 int sum=0;
  for(int ele:pq)
  {
    sum+=ele
  }
  
  return sum/pq.size() ;
  
  
}
