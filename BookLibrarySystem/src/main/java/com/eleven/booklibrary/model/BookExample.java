package com.eleven.booklibrary.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BookExample {
    protected String orderByClause;

    protected boolean distinct;
    
    protected Long offset;
    
    public Long getOffset() {
      return offset;
    }

    public void setOffset(long offset) {
      this.offset = offset;
    }

    public long getLength() {
      return length;
    }

    public void setLength(long length) {
      this.length = length;
    }

    protected long length;

    protected List<Criteria> oredCriteria;

    public BookExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBookNumberIsNull() {
            addCriterion("bookid is null");
            return (Criteria) this;
        }

        public Criteria andBookNumberIsNotNull() {
            addCriterion("bookid is not null");
            return (Criteria) this;
        }

        public Criteria andBookNumberEqualTo(Long value) {
            addCriterion("bookid =", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotEqualTo(Long value) {
            addCriterion("bookid <>", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberGreaterThan(Long value) {
            addCriterion("bookid >", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("bookid >=", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberLessThan(Long value) {
            addCriterion("bookid <", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberLessThanOrEqualTo(Long value) {
            addCriterion("bookid <=", value, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberIn(List<Long> values) {
            addCriterion("bookid in", values, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotIn(List<Long> values) {
            addCriterion("bookid not in", values, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberBetween(Long value1, Long value2) {
            addCriterion("bookid between", value1, value2, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNumberNotBetween(Long value1, Long value2) {
            addCriterion("bookid not between", value1, value2, "bookNumber");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("title =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("title <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("title >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("title <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("title like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("title not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("title in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("title not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("cbs is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("cbs is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("cbs =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("cbs <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("cbs >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("cbs >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("cbs <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("cbs <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("cbs like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("cbs not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("cbs in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("cbs not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("cbs between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("cbs not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterion("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterion("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterion("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterion("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterion("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterion("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterion("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterion("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterion("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("czy =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("czy <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("czy >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("czy >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("czy <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("czy <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("czy in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("czy not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("czy between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("czy not between", value1, value2, "price");
            return (Criteria) this;
        }

                public Criteria andBookTypeIsNull() {
            addCriterion("tslx is null");
            return (Criteria) this;
        }
        public Criteria andBookTypeIsNotNull() {
            addCriterion("tslx is not null");
            return (Criteria) this;
        }

        public Criteria andBookTypeEqualTo(String value) {
            addCriterion("tslx =", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotEqualTo(String value) {
            addCriterion("tslx <>", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeGreaterThan(String value) {
            addCriterion("tslx >", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tslx >=", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLessThan(String value) {
            addCriterion("tslx <", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLessThanOrEqualTo(String value) {
            addCriterion("tslx <=", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLike(String value) {
            addCriterion("tslx like", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotLike(String value) {
            addCriterion("tslx not like", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeIn(List<String> values) {
            addCriterion("tslx in", values, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotIn(List<String> values) {
            addCriterion("tslx not in", values, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeBetween(String value1, String value2) {
            addCriterion("tslx between", value1, value2, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotBetween(String value1, String value2) {
            addCriterion("tslx not between", value1, value2, "bookType");
            return (Criteria) this;
        }

        public Criteria andStoreLocationIsNull() {
            addCriterion("sjmc is null");
            return (Criteria) this;
        }

        public Criteria andStoreLocationIsNotNull() {
            addCriterion("sjmc is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLocationEqualTo(String value) {
            addCriterion("sjmc =", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotEqualTo(String value) {
            addCriterion("sjmc <>", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationGreaterThan(String value) {
            addCriterion("sjmc >", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationGreaterThanOrEqualTo(String value) {
            addCriterion("sjmc >=", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationLessThan(String value) {
            addCriterion("sjmc <", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationLessThanOrEqualTo(String value) {
            addCriterion("sjmc <=", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationLike(String value) {
            addCriterion("sjmc like", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotLike(String value) {
            addCriterion("sjmc not like", value, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationIn(List<String> values) {
            addCriterion("sjmc in", values, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotIn(List<String> values) {
            addCriterion("sjmc not in", values, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationBetween(String value1, String value2) {
            addCriterion("sjmc between", value1, value2, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreLocationNotBetween(String value1, String value2) {
            addCriterion("sjmc not between", value1, value2, "storeLocation");
            return (Criteria) this;
        }

        public Criteria andStoreDateIsNull() {
            addCriterion("rkrq is null");
            return (Criteria) this;
        }

        public Criteria andStoreDateIsNotNull() {
            addCriterion("rkrq is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDateEqualTo(Date value) {
            addCriterion("rkrq =", value, "storeDate");
            return (Criteria) this;
        }

        public Criteria andStoreDateNotEqualTo(Date value) {
            addCriterion("rkrq <>", value, "storeDate");
            return (Criteria) this;
        }

        public Criteria andStoreDateGreaterThan(Date value) {
            addCriterion("rkrq >", value, "storeDate");
            return (Criteria) this;
        }

        public Criteria andStoreDateGreaterThanOrEqualTo(Date value) {
            addCriterion("rkrq >=", value, "storeDate");
            return (Criteria) this;
        }

        public Criteria andStoreDateLessThan(Date value) {
            addCriterion("rkrq <", value, "storeDate");
            return (Criteria) this;
        }

        public Criteria andStoreDateLessThanOrEqualTo(Date value) {
            addCriterion("rkrq <=", value, "storeDate");
            return (Criteria) this;
        }

        public Criteria andStoreDateIn(List<Date> values) {
            addCriterion("rkrq in", values, "storeDate");
            return (Criteria) this;
        }

        public Criteria andStoreDateNotIn(List<Date> values) {
            addCriterion("rkrq not in", values, "storeDate");
            return (Criteria) this;
        }

        public Criteria andStoreDateBetween(Date value1, Date value2) {
            addCriterion("rkrq between", value1, value2, "storeDate");
            return (Criteria) this;
        }

        public Criteria andStoreDateNotBetween(Date value1, Date value2) {
            addCriterion("rkrq not between", value1, value2, "storeDate");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberIsNull() {
            addCriterion("jccs is null");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberIsNotNull() {
            addCriterion("jccs is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberEqualTo(Integer value) {
            addCriterion("jccs =", value, "borrowedNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberNotEqualTo(Integer value) {
            addCriterion("jccs <>", value, "borrowedNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberGreaterThan(Integer value) {
            addCriterion("jccs >", value, "borrowedNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("jccs >=", value, "borrowedNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberLessThan(Integer value) {
            addCriterion("jccs <", value, "borrowedNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberLessThanOrEqualTo(Integer value) {
            addCriterion("jccs <=", value, "borrowedNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberIn(List<Integer> values) {
            addCriterion("jccs in", values, "borrowedNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberNotIn(List<Integer> values) {
            addCriterion("jccs not in", values, "borrowedNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberBetween(Integer value1, Integer value2) {
            addCriterion("jccs between", value1, value2, "borrowedNumber");
            return (Criteria) this;
        }

        public Criteria andBorrowedNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("jccs not between", value1, value2, "borrowedNumber");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("kczl is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("kczl is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("kczl =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("kczl <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("kczl >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("kczl >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("kczl <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("kczl <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("kczl in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("kczl not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("kczl between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("kczl not between", value1, value2, "number");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}