package dio.credit.application.system.entity

import dio.credit.application.system.enummeration.Status
import dio.credit.application.system.entity.Custumer
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID
import jakarta.persistence.*

@Entity
@Table(name = "Credit")
data class Credit(
    @Column(nullable = false, unique = true) val creditCode: UUID = UUID.randomUUID(),
    @Column(nullable = false) val creditValue: BigDecimal = BigDecimal.ZERO,
    @Column(nullable = false) val dayFirstInstallment: LocalDate,
    @Column(nullable = false) val numberOfInstallments: Int = 0,
    @Enumerated val status: Status = Status.IN_PROGRESS,
    @ManyToOne val custumer: Custumer? = null,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
)