public enum USCurrency {
    
    PENNY(0.01f, "PENNY"), 
    NICLE(0.05f), 
    DIME(0.01f), 
    QUARTER(0.25f);

    float val;
    String name;

    USCurrency(float val){
        this.val = val; 
    }

    USCurrency(float val, String name){
        this.val = val;
        this.name = name;
    }
}
