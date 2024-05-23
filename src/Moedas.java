public record Moedas(String conversion_result) {
    @Override
    public String toString() {
        return "Valor = " +  conversion_result;
    }
}
