package com.example.demo.vo;

public class FormByPageVo {
   private FormVo formVo;
   private int page;
   private int limit;

    public FormByPageVo(FormVo formVo, int page, int limit) {
        this.formVo = formVo;
        this.page = page;
        this.limit = limit;
    }

    public FormVo getFormVo() {
        return formVo;
    }

    public void setFormVo(FormVo formVo) {
        this.formVo = formVo;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "FormByPageVo{" +
                "formVo=" + formVo +
                ", page=" + page +
                ", limit=" + limit +
                '}';
    }
}
