package com.assignment.question;

@WithBuilder
public class QueryBuilder {

    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    //step-1 Make constructor of outer class  private
    private QueryBuilder(Builder b) {
        this.select = b.select;
        this.from = b.from;
        this.where = b.where;
        this.join = b.join;
        this.orderBy = b.orderBy;
        this.groupBy = b.groupBy;  
    }

    //step-2 create static method to get the builder object
    public static Builder builder() {
        return new Builder();
    }

    //step-3 create static inner class(Builder class)
    public static class Builder {
        //step-3.1 inner class has the same attributes as outer class
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        //step-3.2 add setters
        public Builder setSelect(String select) {
            this.select = select;
            return this;
        }

        public Builder setFrom(String from) {
            this.from = from;
            return this;
        }

        public Builder setWhere(String where) {
            this.where = where;
            return this;
        }

        public Builder setJoin(String join) {
            this.join = join;
            return this;
        }

        public Builder setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        //step-3.3 add build() to validate and create object
        public QueryBuilder build() {
            return new QueryBuilder(this);
        }
    } 
}