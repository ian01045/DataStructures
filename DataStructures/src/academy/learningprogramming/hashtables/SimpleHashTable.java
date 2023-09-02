package academy.learningprogramming.hashtables;

import academy.learningprogramming.list.Employee;

public class SimpleHashTable
{
     private StoredEmployee[] hashtable;

     public SimpleHashTable() {
         hashtable = new StoredEmployee[10];
     }

     public void put(String key, Employee employee){
         int hashedKey = hashKey(key);

         if(occupied(hashedKey)){
             //when probing warp back to the input key means there's no empty position in hashtable
             int stopIndex = hashedKey;
             //handle first probe
             if(hashedKey == hashtable.length -1 ){
                 //handle wrap array index back to start position
                 hashedKey = 0;
             }else{
                 hashedKey ++;
             }

             //handle the probe loop
             while(occupied(hashedKey)&&hashedKey != stopIndex){
                 //if hashedKey+1 == hashtable.length mod will let hashedKey back 0 to handle wrap array index
                 hashedKey = (hashedKey + 1) % hashtable.length;
             }
         }

         if(hashtable[hashedKey] != null){
//             System.out.println("Sorry, there's already an employee at position "+ hashedKey);
             System.out.println("Sorry, the hashtable is full !");
         }else{
             hashtable[hashedKey]= new StoredEmployee(key,employee);
         }
     }

     public Employee get(String key){
         int hashedKey = findKey(key);
         if(hashedKey == -1){
             return null;
         }
         return hashtable[hashedKey].employee;
     }

     public Employee remove(String key){
         int hashedKey = findKey(key);
         if( hashedKey == -1){
             return null;
         }

         Employee employee = hashtable[hashedKey].employee;
         hashtable[hashedKey] = null;

         StoredEmployee[] oldHashtable = hashtable;
         hashtable = new StoredEmployee[oldHashtable.length];
         for(int i=0 ; i<oldHashtable.length; i++){
             if(oldHashtable[i] != null){
                 put(oldHashtable[i].key,oldHashtable[i].employee);
             }
         }

         return employee;

     }


     private int hashKey(String key){
         return key.length() % hashtable.length;
     }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        //when probing warp back to the input key means there's no empty position in hashtable
        int stopIndex = hashedKey;
        //handle first probe
        if (hashedKey == hashtable.length - 1) {
            //handle wrap array index back to start position
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        //handle the probe loop
        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            //if hashedKey+1 == hashtable.length mod will let hashedKey back 0 to handle wrap array index
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }else{
            return -1;
        }


    }

     private boolean occupied(int index){
         return hashtable[index]!=null;
     }
     public void printHashTable(){
         for (int i=0; i<hashtable.length; i++){
             if(hashtable[i] == null){
                 System.out.println("empty");
             }else{
                 System.out.println("Position "+ i +": "+hashtable[i].employee);
             }
         }
     }
}
