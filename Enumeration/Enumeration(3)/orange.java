public enum orange {
    
    SASHEN("PORGRAMMER"),
    HASINDU("PHOTOGRAPHER"),
    KAMAL("TEACHER"),
    NIMAL("DRIVER");
    
    private final String DESE;
    
    orange(String description){
        DESE =  description;   
    }
    
    public String getDese(){
        return DESE;
    }
    
}