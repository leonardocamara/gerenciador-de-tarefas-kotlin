package br.com.leonardo.pratica.gerenciadortarefas.configurations

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfiguration {
    //swagger é sempre usado para documentar a API rest,
    // usa as anotações pra pegar a referencia na criação dessa documentação.
    @Bean
    fun configureSwagger(): Docket = Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any()) //aqui pedi pra mapear todas as APIS
        .paths(PathSelectors.any()) //aqui mapeei todos os paths (funções das rotas)
        .build()
}