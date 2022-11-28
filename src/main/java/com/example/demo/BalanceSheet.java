package com.example.demo;

public class BalanceSheet {

    private Long id;
    private Double closingBalance;
    private Double openingBalance;
    private Double totalCredits;
    private Double totalDebits;

    public BalanceSheet(Long id, Double openingBalance, Double totalCredits,
    Double totalDebits, Double closingBalance){
        this.id = id;
        this.closingBalance = closingBalance;
        this.openingBalance = openingBalance;
        this.totalCredits = totalCredits;
        this.totalDebits = totalDebits;
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @param closingBalance the closingBalance to set
     */
    public void setClosingBalance(Double closingBalance) {
        this.closingBalance = closingBalance;
    }
    /**
     * @param openingBalance the openingBalance to set
     */
    public void setOpeningBalance(Double openingBalance) {
        this.openingBalance = openingBalance;
    }
    /**
     * @param totalCredits the totalCredits to set
     */
    public void setTotalCredits(Double totalCredits) {
        this.totalCredits = totalCredits;
    }
    /**
     * @param totalDebits the totalDebits to set
     */
    public void setTotalDebits(Double totalDebits) {
        this.totalDebits = totalDebits;
    }
    /**
     * @return the closingBalance
     */
    public Double getClosingBalance() {
        return closingBalance;
    }
    /**
     * @return the openingBalance
     */
    public Double getOpeningBalance() {
        return openingBalance;
    }
    /**
     * @return the totalCredits
     */
    public Double getTotalCredits() {
        return totalCredits;
    }
    /**
     * @return the totalDebits
     */
    public Double getTotalDebits() {
        return totalDebits;
    }

}
