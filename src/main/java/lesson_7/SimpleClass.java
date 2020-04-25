package lesson_7;

public class SimpleClass {
    private String name;
    private int age;
    public String type;

    SimpleClass(String name, int age, String type){
        this.age = age;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    @BeforeSuite
    public void born(){
        System.out.println("Simple being is born");
    }

    @Test
    public void year1(){
        System.out.println("This being lieved through his 1st year");
    }

    @Test
    public void yearN(){
        System.out.println("This being lieved through his" + (++age) + "th year");
    }

    @Test
    public void year10(){
        System.out.println("This being lieved through his 10th year");
    }

    @AfterSuite
    public void dead(){
        System.out.println("This is the end, beautiful friend");
    }
}
