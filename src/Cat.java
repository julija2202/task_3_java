public class Cat {
    String name_1 = "Christofer";
    int age_1 = 1;

    public String getName() {
        return name_1;
    }

    public void setName(String name) {
        this.name_1 = name;
    }

    public int getAge() {
        return age_1;
    }

    public void setAge(int age) {
        this.age_1 = age;
    }
    public String toString() {
        return "Имя котика " + this.getName() + ", его возраст - " + this.getAge();
    }


    }

