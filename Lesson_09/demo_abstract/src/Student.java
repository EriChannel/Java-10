public class Student extends  Person{
    private float point;

    public Student(int id, String name, String address, float point) {
        super(id, name, address);
        this.point = point;
    }

    public Student() {
    }

    @Override
    public void show() {

    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                '}';
    }


    public void method() {
        super.method();
    }
}
