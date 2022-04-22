

public class Prenda { 
    TipoPrenda tipoPrenda;
    Categoria categoria;
    Material material;
    Color colorPrimario;
    Color colorSecundario;
  
    public Prenda(TipoPrenda tipoPrenda, Categoria categoria, Material material, Color colorPrimario, Color colorSecundario) {
        if(tipo == null || categoria == null || material == null || colorPrimario == null) {
            throw new Exception(
              "Faltan datos de la prenda"
            );
            if (!categoria.equals(tipoPrenda.getCategoria())) {
                throw new Excepcion(
                    "No corresponde la categoria de la prenda con su tipo");
              };
       this.tipoPrenda = tipoPrenda;
       this.categoria = categoria;
       this.material = material;
       this.colorPrimario = colorPrimario;
       this.colorSecundario = colorSecundario;
    }
  }

  public Categoria getCategoria() {
    return this.categoria;
  }

}

class Color{
    Int red;
    Int green;
    Int blue;
}

enum Categoria{
  PARTE_SUPERIOR, 
  CALZADO, 
  PARTE_INFERIOR, 
  ACCESORIOS
}


