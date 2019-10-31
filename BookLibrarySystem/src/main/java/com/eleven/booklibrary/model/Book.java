package com.eleven.booklibrary.model;

import java.util.Date;


public class Book {
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName
				+ ", author=" + author + ", publisher=" + publisher
				+ ", publishDate=" + publishDate + ", price=" + price
				+ ", bookType=" + bookType + ", storeLocation=" + storeLocation
				+ ", storeDate=" + storeDate + ", borrowedNumber="
				+ borrowedNumber + ", number=" + number + ", translator="
				+ translator + ", txm=" + txm + ", czy=" + czy + ", bookzt="
				+ bookzt + "]";
	}

	private Long bookNumber;

    private String bookName;

    private String author;

    private String publisher;

    private Date publishDate;

    private Long price;

    private String bookType;

    private String storeLocation;

    private Date storeDate;

    private Integer borrowedNumber;

    private Integer number;
    
    private String translator;
    
    private String txm;
    
    private String czy;
    
    

	public String getCzy() {
		return czy;
	}

	public void setCzy(String czy) {
		this.czy = czy;
	}

	private Integer bookzt;
	
	
    public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public String getTxm() {
		return txm;
	}

	public void setTxm(String txm) {
		this.txm = txm;
	}

	public Integer getBookzt() {
		return bookzt;
	}

	public void setBookzt(Integer bookzt) {
		this.bookzt = bookzt;
	}



    public Long getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Long bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }



	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType == null ? null : bookType.trim();
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation == null ? null : storeLocation.trim();
    }

    public Date getStoreDate() {
        return storeDate;
    }

    public void setStoreDate(Date storeDate) {
        this.storeDate = storeDate;
    }

    public Integer getBorrowedNumber() {
        return borrowedNumber;
    }

    public void setBorrowedNumber(Integer borrowedNumber) {
        this.borrowedNumber = borrowedNumber;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}