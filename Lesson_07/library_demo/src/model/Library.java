package model;

public class Library{
    private String id;
    private String title;
    private String company;
    private int year;
    private int amount;

    public Library(String id, String title, String company, int year, int amount) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.year = year;
        this.amount = amount;
    }

    public Library() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public String toString() {
        return "Library{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", year=" + year +
                ", amount=" + amount +
                '}';
    }
}
