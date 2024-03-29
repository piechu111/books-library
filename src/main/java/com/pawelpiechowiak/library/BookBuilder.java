package com.pawelpiechowiak.library;

import java.util.List;

public final class BookBuilder {
    private String isbn;
    private String title;
    private String subtitle;
    private String publisher;
    private Long publishedDate;
    private String description;
    private Integer pageCount;
    private String thumbnail;
    private String language;
    private String previewLink;
    private Double averageRating;
    private List<String> authors;
    private List<String> categories;

    public static BookBuilder aBook() {
        return new BookBuilder();
    }

    public BookBuilder withIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder withSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public BookBuilder withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public BookBuilder withPublishedDate(Long publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    public BookBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public BookBuilder withPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public BookBuilder withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public BookBuilder withLanguage(String language) {
        this.language = language;
        return this;
    }

    public BookBuilder withPreviewLink(String previewLink) {
        this.previewLink = previewLink;
        return this;
    }

    public BookBuilder withAverageRating(Double averageRating) {
        this.averageRating = averageRating;
        return this;
    }

    public BookBuilder withAuthors(List<String> authors) {
        this.authors = authors;
        return this;
    }

    public BookBuilder withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public Book build() {
        Book book = new Book();
        book.setIsbn(isbn);
        book.setTitle(title);
        book.setSubtitle(subtitle);
        book.setPublisher(publisher);
        book.setPublishedDate(publishedDate);
        book.setDescription(description);
        book.setPageCount(pageCount);
        book.setThumbnailUrl(thumbnail);
        book.setLanguage(language);
        book.setPreviewLink(previewLink);
        book.setAverageRating(averageRating);
        book.setAuthors(authors);
        book.setCategories(categories);
        return book;
    }
}
