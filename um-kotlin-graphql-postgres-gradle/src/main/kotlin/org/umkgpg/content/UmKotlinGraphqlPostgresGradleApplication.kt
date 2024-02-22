package org.umkgpg.content

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UmKotlinGraphqlPostgresGradleApplication

fun main(args: Array<String>) {
    runApplication<UmKotlinGraphqlPostgresGradleApplication>(*args)
}
