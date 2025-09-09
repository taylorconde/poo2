# Aula 1 -- Interfaces em Java

## 🎯 Objetivos

- Entender **o que é interface** e sua função como contrato.
- Diferenciar **classe abstrata** e **interface**.
- Usar `@Override` corretamente.
- Conhecer **interfaces de marcação**.
- Entender porque **métodos `default`** foram criados.
- Usar `Comparable` para ordenação.
- Aplicar **interfaces em coleções** (`List`, `Collection`).
- Conceito de sealed interfaces

------------------------------------------------------------------------

## 1. O que é uma Interface

- Uma **interface** é um contrato que define um conjunto de métodos que uma classe deve implementar.
- Diferente de classes concretas, **interfaces não possuem implementação** (até o Java 7).
- Permitem o **polimorfismo**: várias classes podem implementar a mesma interface.
- Permitem a múltipla implementação, diferente do `extends`

### Exemplo básico:

``` java
interface Animal {
    void fazerSom();
}

class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}

class Gato implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}
```

Uso:

``` java
List<Animal> animais = new ArrayList<>();
animais.add(new Cachorro());
animais.add(new Gato());

for (Animal a : animais) {
    a.fazerSom();
}
```

### Exemplo prático

Interface `Comunicacao` que define um contrato para enviar mensagens.

```java
interface Comunicacao {
    void enviarMensagem(String destino, String conteudo);
}

class Email implements Comunicacao {
    @Override
    public void enviarMensagem(String destino, String conteudo) {
        System.out.println("Enviando EMAIL para " + destino + ": " + conteudo);
    }
}

class Sms implements Comunicacao {
    @Override
    public void enviarMensagem(String destino, String conteudo) {
        System.out.println("Enviando SMS para " + destino + ": " + conteudo);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Comunicacao> canais = new ArrayList<>();
        canais.add(new Email());
        canais.add(new Sms());

        for (Comunicacao c : canais) {
            c.enviarMensagem("12345", "Olá, esta é uma notificação.");
        }
    }
}
```

------------------------------------------------------------------------

## 2. Diferença entre Interface e Classe Abstrata

### Tabela Comparativa

| Aspecto                                | Interface                                                                                                                                            | Classe Abstrata                                                                               |
|----------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------|
| **Atributos de instância (estado)**    | Não pode ter atributos de instância.                                                                                                                 | Pode ter atributos de instância (estado).                                                     |
| **Constantes (`public static final`)** | Pode ter; todo campo declarado é implicitamente `public static final`.                                                                               | Pode ter constantes (com modificadores explícitos).                                           |
| **Campos estáticos mutáveis**          | Não (campos em interface são sempre `public static final`).                                                                                          | Sim, pode ter campos `static` mutáveis (com cuidado).                                         |
| **Métodos abstratos**                  | Sim; por padrão são `public abstract`.                                                                                                               | Sim; podem ser `public`/`protected` (ou `abstract` sem corpo).                                |
| **Métodos concretos**                  | Sim, via `default` (Java 8+) e `static` (Java 8+).                                                                                                   | Sim, métodos concretos normais.                                                               |
| **Métodos `default`**                  | Sim (Java 8+). Usados para evoluir APIs sem quebrar implementações existentes.                                                                       | Não se aplica; métodos concretos já são suportados nativamente.                               |
| **Métodos `static`**                   | Sim (Java 8+). Úteis para utilidades relacionadas ao contrato.                                                                                       | Sim. Podem acessar apenas membros `static`.                                                   |
| **Métodos `private`**                  | Sim (Java 9+) para uso interno da própria interface (auxiliares).                                                                                    | Sim (como em qualquer classe).                                                                |
| **Construtores**                       | Não possui.                                                                                                                                          | Possui (para inicializar estado).                                                             |
| **Herança/Implementação**              | Uma classe pode **implementar** várias interfaces.                                                                                                   | Uma classe só pode **estender** uma classe (herança única).                                   |
| **Modificadores de acesso em métodos** | `public` por padrão; `private` permitido (Java 9+) para uso interno; `protected` não se aplica.                                                      | `public`, `protected`, `private`.                                                             |
| **Objetivo principal**                 | Definir um **contrato de comportamento** (o que fazer).                                                                                              | Fornecer uma **base parcial** com estado e comportamento comum.                               |
| **Quando preferir**                    | Quando quer acoplamento baixo, múltiplas implementações e polimorfismo por contrato.                                                                 | Quando precisa compartilhar estado e parte da implementação entre subclasses.                 |
| **Boas práticas**                      | Evitar lógica pesada em `default`; usar `static` apenas para utilidades claras; não usar interface para armazenar constantes "genéricas" do sistema. | Evitar herança profunda; preferir composição; documentar comportamento comum e manter coesão. |
| **Exemplos comuns**                    | `Comparable`, `Runnable`, `List`, `Map`                                                                                                              | `AbstractList`, `AbstractMap`, `HttpServlet`                                                  |

### Conclusões

- **Interface = contrato de comportamento**; não possui estado de instância. Permite múltiplas implementações e favorece
  o polimorfismo.
- **Classe abstrata = modelo base com estado**; oferece implementação parcial e herança única.
- **Métodos `default`** surgem para **evolução de APIs** sem quebrar código legado; use-os com parcimônia.
- **Métodos `static`** em interfaces e classes devem ser **utilidades coesas**; evite "interfaces de constantes" e
  lógica complexa.
- **Métodos `private`** em interfaces (Java 9+) servem apenas para **reuso interno** entre `default/static` da própria
  interface.
- Regra prática: **use interface** para contratos e flexibilidade; **use classe abstrata** quando há **estado e
  comportamento comum** a compartilhar.

### Exemplo prático

```java
abstract class Forma {
    abstract double area();
}

interface Desenhavel {
    void desenhar();
}

class Circulo extends Forma implements Desenhavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public void desenhar() {
        String circulo = """
                               **************
                            **********************
                         ****************************
                      ***********            ***********
                     ********                    ********
                   ********                        ********
                  *******                            *******
                 *******                              *******
                 ******                                ******
                ******                                  ******
                ******                                  ******
                ******                                  ******
                ******                                  ******
                ******                                  ******
                 ******                                ******
                 *******                              *******
                  *******                            *******
                   ********                        ********
                     ********                    ********
                      ***********            ***********
                         ****************************
                            **********************
                                **************
                """;
        System.out.println(circulo);

    }
}
```

<details>
  <summary>Faça agora para um retângulo</summary>

```java
class Retangulo extends Forma implements Desenhavel {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    double area() {
        return largura * altura;
    }

    @Override
    public void desenhar() {
        System.out.println("********");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("********");
    }
}

public class Main {
    public static void main(String[] args) {
        Desenhavel c = new Circulo(3);
        Desenhavel r = new Retangulo(4, 2);

        System.out.println("Circulo:");
        c.desenhar();

        System.out.println("\nRetangulo:");
        r.desenhar();
    }
}
```

</details>

------------------------------------------------------------------------

## 3. O uso de `@Override`

- `@Override` indica que estamos **reescrevendo** um método de uma interface ou classe pai.
- Evita erros de digitação e melhora a legibilidade.

``` java
interface Pagamento {
    void processarPagamento(double valor);
}

class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento no cartão: " + valor);
    }
}
```

### O que acontece se

- eu remover o `@Override` de um método?
- eu adicionar um `@Override` em um método que não está na interface?
- eu renomear o método de uma classe que possui o `@Override`?
- eu renomear o método da interface ?

------------------------------------------------------------------------

## 4. Interfaces de Marcação

- São **interfaces sem métodos**.
- Servem apenas para **marcar** uma classe com um comportamento especial.
- Exemplo clássico: `Serializable`.

``` java
interface MarcacaoImportante { }

class Documento implements MarcacaoImportante {
    private String titulo;
}
```

➡️ Frameworks ou o próprio compilador usam essa informação para aplicar
regras específicas.

### Exemplo

```java
interface MarcacaoImportante {
}

class Documento implements MarcacaoImportante {
    private String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Documento: " + titulo;
    }
}
```

### Desafio

<details>
  <summary>Faça uma classe Usuario que implementa Serializable. Grave e leia o objeto em arquivo, mostrando a utilidade real da interface de marcação.
</summary>

```java
class Usuario implements Serializable {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Ana", 25);

        // Serializar
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("usuario.ser"))) {
            out.writeObject(u);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Desserializar
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("usuario.ser"))) {
            Usuario lido = (Usuario) in.readObject();
            System.out.println("Objeto lido: " + lido);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

</details>

------------------------------------------------------------------------

## 5. Interfaces e Coleções

- As coleções em Java são baseadas em **interfaces**.
- Exemplo:
    - `Collection<E>` → superinterface de todas as coleções.
    - `List<E>` → define uma lista ordenada.
    - `Set<E>` → define um conjunto sem repetição.

``` java
List<String> nomes = new ArrayList<>();
nomes.add("Ana");
nomes.add("Carlos");

Collection<Integer> numeros = new HashSet<>();
numeros.add(10);
numeros.add(20);
```

------------------------------------------------------------------------

## 6. Métodos `default` em Interfaces

### Por que os métodos `default` nasceram?

Antes do **Java 8**, interfaces só podiam ter métodos abstratos.  
Isso gerava um problema: se alguém criasse uma interface usada por milhares de classes, **não poderia adicionar novos
métodos sem quebrar todo mundo**.

➡️ Exemplo histórico: a interface **`Collection`**.

No Java 8, quis-se adicionar o método `forEach()`.
Se fosse apenas um método abstrato novo, **todas as implementações de `Collection` (ArrayList, HashSet, etc.) teriam que
reimplementar manualmente**, quebrando a retrocompatibilidade.

**Solução:** permitir métodos `default` com implementação padrão.  
Assim, a nova funcionalidade é herdada sem exigir mudanças imediatas nas implementações existentes.

---

### ✅ Vantagens

- **Evolução de APIs sem quebra**: permite adicionar novos métodos em interfaces amplamente usadas sem exigir
  refatoração global.
- **Reuso limitado de código**: fornece comportamento padrão simples.
- **Facilita transição entre versões**: bibliotecas e frameworks podem evoluir sem exigir reimplementação.

---

### ❌ Desvantagens

- **Quebra do princípio de interface pura**: interfaces deixam de ser apenas contratos.
- **Diminui a clareza arquitetural**: risco de concentrar lógica demais em interfaces.
- **Conflitos de herança múltipla**: quando duas interfaces possuem o mesmo método `default`.
- **Impacto em SOLID**:
    - **S (Single Responsibility)**: pode acumular responsabilidades.
    - **I (Interface Segregation)**: pode incentivar interfaces muito grandes.
    - **D (Dependency Inversion)**: gera dependência em implementações padrões.

---

### 🌟 Exemplo de bom uso

```java
interface Pagamento {
    void processar(double valor);

    default void recibo(double valor) {
        System.out.println("Recibo de pagamento no valor: " + valor);
    }
}
```

------------------------------------------------------------------------

## 7. Interface `Comparable`

- Usada para **ordenar objetos**.
- Define a **ordem natural** de uma classe.

## Exemplo prático

Classe `Produto` que ordena por preço.

```java
class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto("Bicicleta", 1500));
        lista.add(new Produto("Celular", 2500));
        lista.add(new Produto("Caneta", 2));

        Collections.sort(lista);
        System.out.println(lista);
    }
}
```

### Desafio

<details>
  <summary>Modifique a classe Produto para ordenar por nome em ordem alfabética. Depois, crie uma lista de produtos, ordene e imprima.
</summary>

```java
@Override
public int compareTo(Produto outro) {
  return this.nome.compareToIgnoreCase(outro.nome);
}
```

</details>


------------------------------------------------------------------------

## 8. Resumo

- **Interface** = contrato.
- **Classe abstrata** = modelo parcial com estado.
- **@Override** garante segurança ao implementar métodos.
- **Interfaces de marcação** servem para dar significado extra.
- **Métodos default** permitem evolução das APIs.
- **Coleções** usam interfaces para padronizar comportamento.
- **Comparable** é exemplo prático de interface essencial no Java.

No desafio de interface, utilize uma interface que realiza uma operação com 2 números, e uma das operações é soma, a
outra é multiplicação. E contextualize como se esse fosse o funcionamento de uma calculadora. alem disso no 5, faça
algum exemplo aonde eu possa fazer algum for com inserção em uma lista e também uma busca para que eu possa comparar o
tempo quando altero a implementação. E por ultimo um bom exemplo e desafio com o comparable.


# Sealed Interfaces em Java

## 📌 O que são?
As **sealed interfaces** foram introduzidas no **Java 15 (prévia)** e se tornaram estáveis no **Java 17 (LTS)**.  
Elas permitem **controlar quais classes podem implementar uma interface**.

---

## 🤔 Por que elas existem?
Antes do recurso, qualquer classe podia implementar uma interface.  
Isso nem sempre era desejado, principalmente quando a interface representava um **conceito fechado** (ex.: um conjunto finito de formas geométricas, resultados possíveis ou tipos de eventos).

Com sealed interfaces, você **restringe o conjunto de implementações permitidas**, tornando a API mais **segura e clara**.

---

## 🎯 Usos
- Criar **hierarquias restritas** de tipos (parecido com `enum`, mas mais flexível).
- Garantir que apenas um **conjunto conhecido de classes** possa implementar a interface.
- Muito útil em **pattern matching com `switch`** (Java 17+), já que o compilador sabe todas as possibilidades.

---

## 📝 Exemplo

```java
sealed interface Forma permits Circulo, Retangulo, Triangulo { }

final class Circulo implements Forma {
    double raio;
    Circulo(double raio) { this.raio = raio; }
}

final class Retangulo implements Forma {
    double largura, altura;
    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
}

final class Triangulo implements Forma {
    double base, altura;
    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
}

public class Main {
    public static void main(String[] args) {
        Forma f = new Circulo(3);

        // Pattern matching com switch (Java 17+)
        switch (f) {
            case Circulo c -> System.out.println("Área círculo: " + (Math.PI * c.raio * c.raio));
            case Retangulo r -> System.out.println("Área retângulo: " + (r.largura * r.altura));
            case Triangulo t -> System.out.println("Área triângulo: " + (t.base * t.altura / 2));
        }
    }
}

```
✅ Resumindo
- Veio 17 como estável no Java.
- Permite limitar quais classes podem implementar uma interface.
- Aumenta a segurança (ninguém cria implementações “não permitidas”).
- Ajuda o compilador a garantir pattern matching exaustivo no switch.
- Use quando o domínio é fechado e conhecido (ex.: status de pedido, tipos de documento, formas geométricas).