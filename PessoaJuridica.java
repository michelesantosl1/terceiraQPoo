public class PessoaJuridica extends Pessoa {
    private long cnpj;
    /**
     * 
     */
    private String RazaoSocial;

    public PessoaJuridica() {
    }
  
    public long getCnpj() {
      return cnpj;
    }
  
    public void setCnpj(long cnpj) {
      this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
      }
    
      /**
     * @param razaoSocial
     * @param pessoaJuridica TODO
     */
    public void setRazaoSocial( String razaoSocial, PessoaJuridica pessoaJuridica) {
        pessoaJuridica.RazaoSocial = RazaoSocial;
      }
  
    
    @Override
	public String toString() {
		return "\nNome: "+ this.getNome()+
    "\nCnpj: "+ this.getCnpj()+
    "\nRazao Social: " + this.getRazaoSocial()+
    "\n--------";
	}

   
  }


