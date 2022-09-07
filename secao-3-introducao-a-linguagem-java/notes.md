# Entendendo as versões do JAVA
- SE: Standart Edition
- LTS: Suporte de longo período (Long Term Support)
- A versão 8 é a última versão de longo suporte antes da versão 11. Versões LTS implicam em menos trabalhos "dor de cabeça" com atualizações.

# Histórico do Java (Contextualização):

# Histórico e edições do Java
- Java é uma linguagem de programação(Regras sintáticas) e também uma plataforma de desenvolvimento e execução. Isso significa que a linguagem fornececerá Bibliotecas(API) e ambientes de execução.

* Histórico:
- Problemas resolvidos e motivo de seu sucesso:
    - Ponteiros / gerenciamento de memória,
    - Portabilidade falha: reescrever parte do código ao mudar de SO.
    - Utilização em dispoisitivos diversos
    - Custo

- Criada pela Sun Microsystems no meio da década de 1990.

- Adquirida pela Oracle Corporation em 2010.

* Aspectos notáveis:
- Código compilado para bytecode e executado em máquina virtual (JVM);
- Portável, segura e robusta;
- Roda em vários tipos de dispositivos;
- DOmiga o mercado corporativo desde o fim do século 20;
- Padrão Android por muitos anos.

* Edições (Importante):
- Java ME - Java Micro Edition -> Destinadas a dispositivos embarcados e móveis - IoT

- Java SE - Java Standard Edition - core -> destinada a desktop e servidores, mas dependendo do contexto ode ser utilizada para aplicações WEB.

- Java EE - Java Enterprise Edition -> destinada a aplicações corporativas



# JDK / JVM - Máquina Virtual do Java
* JVM - Java Virtual Machine
- Necessário para executar sistemas Java (utilizarei ela para desenvolver aplicativos em JAVA). Eu terei que instalar a JVM no computador do cliente para ele ser executada.

* Compilação e Interpretação:

- Linguagem compilada: C, C++ (Mais rápidas)
    - Exemplo: Se eu quiser usar uma uma linguagem compilada em diferentes sistemas operacionais, eu TENHO QUE USAR OUTRO COMPILADAR, ou seja, problema de portabilidade.

- Linguagem interpretadas: PHP, JS 
    - (Maior flexibilidade e manutenção e tem menos bug).

- Linguagem pré-compiladas + máquina virtual: Java, C#.
    - Possuem uma abordadem híbrida. Obteve vantagens dos dois mundos e maior portabilidade.
    O processo de compilação do Byte code se chama JIT (just-in-time)



# Estrutura de uma aplicação Java
- A unidade básica de uma linguagem orienteada a objetos é as classes.
- Package = agrupamento LÓGICO de classes relacionadas.
- Módulo (introduzido no Java 9+): Agrupamento lógico de pacotes relacionados Runtime = Agrupamento físico. (Tipo um grupo de pacotes)
Aplicação: Agrupamento de módulos relacionados

# Instalando o Eclipse (Configurando ele pro primeiro programa)
- Workspace (seleione a pasta na qual os projetos serão salvos)
- Mudar o layout: Window > Perspective > Open Perspective > Java
- Zera o layout: Window > Perspective > Reset Perspective
- Mostrar a aba Console: Window > Show View > Onsole
- Criar projeto: File > New > Java Project
