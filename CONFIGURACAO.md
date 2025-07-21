
# Configurando JUnit

## Maven

Adicionar no `pom.xml` do projeto a dependência abaixo:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>6.0.0-M1</version>
    <scope>test</scope>
</dependency>
```
## Gradle

Adicionar ao arquivo `build.gradle`  `testImplementation` no closure `dependencies` e `useJUnitPlatform()` no closure `test`, ficando mais ou menos assim.

```groovy
dependencies {  
	//demais dependências do projeto
  testImplementation("org.junit.jupiter:junit-jupiter-engine:6.0.0-M1")  
}  
  
test {  
  useJUnitPlatform()  
}
```

Observação: A versão escolhida acima, `6.0.0-M1`, escolhida nos exemplos, era a mais recente até o momento deste manual. Verificar versão mais nova em [Maven Repository](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine).
