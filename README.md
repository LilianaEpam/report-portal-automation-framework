# qa-automation-framework
Repository epam training - Report Portal application

Running:
API:
./gradlew :api-tests:test

UI:
./gradlew :ui-tests:test

All:
./gradlew clean test


Tags Conventions:

| Grupo      | Uso              |

| smoke      | PR checks        |

| api        | API tests        |

| ui         | UI tests         |

| regression | nightly          |

| flaky      | excluidos del PR |
