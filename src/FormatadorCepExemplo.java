public class FormatadorCepExemplo {

    public static void main(final String[] args) {
        try {
            
        final String cepFormatado = formatarCep("23765064");
        System.out.println(cepFormatado);

        } catch (final CepInvalidoException e) {
            System.out.println("O cep nao corresponde com as regras de negocio.");

        }
    }
    
    static String formatarCep(final String cep) throws CepInvalidoException {
        if(cep.length() !=8)
            throw new CepInvalidoException();

            //simulando um cep formatado
            //return "23.765-064";
        return (cep);
    }
    
}
