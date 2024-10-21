class InvestmentCompany {
    private String companyId;
    private double reliabilityScore;
    private double roi;  // Retorno de inversión (Return on Investment)
    private double investmentAmount;
    private int investmentTerm;

    public InvestmentCompany(String companyId, double reliabilityScore, double roi, double investmentAmount, int investmentTerm) {
        this.companyId = companyId;
        this.reliabilityScore = reliabilityScore;
        this.roi = roi;
        this.investmentAmount = investmentAmount;
        this.investmentTerm = investmentTerm;
    }

    public void offerInvestment() {
        System.out.println("Oportunidad de inversión con ROI de: " + roi);
    }
}
