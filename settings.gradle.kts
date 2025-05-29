rootProject.name = "employee-demo-porter-architecture"

include(
    ":ktor:client",
    ":ktor:server",
    ":commons",
    ":Product:api:api-models",
    ":Product:domain",
    ":Product:data",
    ":Product:data:psql",
    ":Product:api:service"
) 