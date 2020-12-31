package lab7;

class Context{
    private ISort strategy;
    public void setStrategy(ISort strategy){
        this.strategy = strategy;
    }
    public void executeStrategy(byte[] array){
        strategy.sortArray(array);
    }
}