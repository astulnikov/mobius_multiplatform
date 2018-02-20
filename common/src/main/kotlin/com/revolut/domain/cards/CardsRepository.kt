package com.revolut.domain.cards

import com.revolut.domain.models.RevolutCard

/**
 * Created by yatsinar on 19/02/2018.
 * Revolut
 * All rights reserved
 */
expect class CardsRepository {

    suspend fun getAllCards(): List<RevolutCard>


}