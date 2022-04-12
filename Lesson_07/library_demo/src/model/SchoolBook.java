package model;

public class SchoolBook extends Library{
    private int pageNumber;
    private String status;
    private int amountBorrow;

    public SchoolBook() {
    }

    public SchoolBook(String id, String title, String company, int year, int amount, int pageNumber, String status, int amountBorrow) {
        super(id, title, company, year, amount);
        this.pageNumber = pageNumber;
        this.status = status;
        this.amountBorrow = amountBorrow;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmountBorrow() {
        return amountBorrow;
    }

    public void setAmountBorrow(int amountBorrow) {
        this.amountBorrow = amountBorrow;
    }

    public String toString() {
        return super.toString() + " - " + "SchoolBook{" +
                "pageNumber=" + pageNumber +
                ", status='" + status + '\'' +
                ", amountBorrow=" + amountBorrow +
                '}';
    }
}
