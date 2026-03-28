# Projetos de Desenvolvimento Web e Estruturas de Dados

Repositório com uma coleção de projetos acadêmicos envolvendo desenvolvimento web com Java EE e processamento de linguagens formais com Node.js.

---

## Projetos

### 1. LF — Processador de Linguagens Formais
Processador de gramáticas formais com parsing baseado em pilha, implementado em Node.js.

**Tecnologias:** Node.js
**Como executar:**
```bash
cd LF
npm install
npm start
```
> A gramática pode ser customizada editando `gramar.js`.

---

### 2. Pedido — Sistema de Pedidos (Básico)
Aplicação web para gerenciamento de pedidos e itens com armazenamento em memória.

**Tecnologias:** Java, JSF
**Como executar:** Importar no NetBeans e fazer deploy em servidor de aplicação (Tomcat/GlassFish).

---

### 3. Login — Autenticação de Usuários
Módulo de autenticação com formulário de login via JSF.

**Tecnologias:** Java, JSF
**Como executar:** Importar no NetBeans e fazer deploy em servidor de aplicação.

---

### 4. NeuraHotel — Sistema de Gestão Hoteleira
Sistema de gerenciamento hoteleiro com persistência via JPA e banco MySQL.

**Tecnologias:** Java, JSF, JPA (EclipseLink), MySQL
**Configuração do banco:**
- Host: `localhost:3306`
- Database: `jpatestdb`
- Usuário: `root`

**Como executar:** Importar no NetBeans, configurar o banco MySQL e fazer deploy.

---

### 5. PedidosJPA — Sistema de Pedidos com JPA
Versão avançada do sistema de pedidos com persistência JPA, relacionamentos entre entidades e operações CRUD completas.

**Tecnologias:** Java, JSF, JPA (EclipseLink), HSQLDB
**Entidades:** `Cliente`, `Pedido`, `Item`, `Produto`
**Como executar:** Importar no NetBeans e fazer deploy. O banco HSQLDB é criado automaticamente na inicialização.

---

## Requisitos Gerais

| Projeto     | Requisitos                                      |
|-------------|------------------------------------------------|
| LF          | Node.js                                        |
| Pedido      | Java JDK, Apache Ant, Servidor de aplicação    |
| Login       | Java JDK, Apache Ant, Servidor de aplicação    |
| NeuraHotel  | Java JDK, Apache Ant, Servidor de aplicação, MySQL |
| PedidosJPA  | Java JDK, Apache Ant, Servidor de aplicação, HSQLDB |

---

## Estrutura do Repositório

```
.
├── LF/           # Processador de linguagens formais (Node.js)
├── Login/        # Módulo de autenticação (JSF)
├── Pedido/       # Sistema de pedidos básico (JSF)
├── NeuraHotel/   # Sistema hoteleiro (JSF + JPA + MySQL)
└── PedidosJPA/   # Sistema de pedidos com JPA (JSF + JPA + HSQLDB)
```

Os projetos Java seguem o padrão MVC: **Modelos** → **Managed Beans (Controllers)** → **Views XHTML**, e foram desenvolvidos com o NetBeans IDE.
