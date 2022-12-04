package com.hruser.entities

import javax.persistence.*


@Entity(name = "tb_user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    val name: String,

    @Column(unique = true)
    val email: String,
    val password: String,

    @JoinTable(
        name = "tb_user_role",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "role_id")]
    )
    @ManyToMany(fetch = FetchType.EAGER)
    val roles: Set<Role>? = HashSet()
)