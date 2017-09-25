import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Анна on 24.09.2017.
 */
public class Tracker extends Item {

     private  Item[] items = new Item[100];
     public int  position =0;
     private static final Random RN= new Random();

    public Item add(Item item){
        item.setId(this.generatedId());
        this.items[position] = item;
        return item;

    }
    public Item findById(String id ) {
        Item result = null;
        for(Item item: items) {

            if (item != null && item.getId(id).equals(id)) {
                result = item;
                break;
            }
        }
        return  result;
    }
    String generatedId() {
        return String.valueOf(RN.nextInt());
    }

    public void update(Item item){
        Item result = null;
        for(Item item1: items) {

            if (item != null && item.getId(generatedId()).equals(generatedId())) {
                result = item;
                break;
            }
        }

    }
//Метод public void update(Item) должен заменить ячейку в массиве this.items.
// Для этого необходимо найти ячейку в массиве по id (id у Item можно получить с помощью метода getId).
// Обязательно принимать один параметр Item, а не список полей;


  public void delete(Item item){
      Item result = null;
      for(Item item1: items) {

          if (item != null && item.getId(generatedId()).equals(generatedId())) {
              result = null;
          break;
          }
      }
      //System.arraycopy(elementData, index+1, elementData, index,      numMoved);

      }
      //Метод public void delete(Item) должен удалить ячейку в массиве this.items. Для этого необходимо найти ячейку в массиве по id.
      //После этого присвоить ей null, либо сместить все значения справа от удаляемого элемента - на одну ячейку влево с помощью System.arrayCopy();
    public Item[] findAll(){
      Item [] result = new Item[position];
      for(int index =0; index!=this.position; index++) {
          result[index]= this.items[index];
      }
      return result;


    }
    public ArrayList<String> findByName(String key){
        ArrayList<String> result = new ArrayList<String>();
        for(Item item: items) {
            if(item.getName().equals(key)){
               result.add(name);

            }
        }
        return result;

        }

    }

