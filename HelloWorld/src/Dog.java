public class Dog {
    String breed;
    int age;
    String name;
    String[] fetchedItems = {"nada","nada","nada"};

    public Dog(String inputBreed, int inputAge, String inputName){
        this.breed = inputBreed;
        this.age = inputAge;
        this.name = inputName;
    }

    public void addFetchedItems(String[] newFetchedItems){
        for(int x=0; x< newFetchedItems.length; x++){
            this.fetchedItems[x] = newFetchedItems[x];
        }
    }

    public void getFetchedItems(){
        for(int x=0; x< fetchedItems.length; x++){
            System.out.println(fetchedItems[x]);
        }
    }

}
