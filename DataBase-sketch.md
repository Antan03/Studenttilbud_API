```mermaid
erDiagram
    Butikk ||--o{ Tilbud : Har
    Kategori ||--o{ Tilbud : Har
    Butikk {
        int id PK
        string name
        string nettside
        string adresse
    }
    Tilbud {
        int id PK
        int prosent
        string beskrivelse
        int butikk_id FK
        int kategori FK
        date utlopsdato
    }
    Kategori {
        int id PK
        string navn
    }

```