class Book {
    String title;
    int yearOfPublishing;
    String[] authors;
    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors == null ? new String[0] : authors;
    }
}