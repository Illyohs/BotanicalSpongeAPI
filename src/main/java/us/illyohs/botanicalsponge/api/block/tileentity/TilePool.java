/**
 * opyright (c) Year, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice, this
 *        list of conditions and the following disclaimer.
 *
 *     * Redistributions in binary form must reproduce the above copyright notice,
 *        this list of conditions and the following disclaimer in the documentation
 *        and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package us.illyohs.botanicalsponge.api.block.tileentity;

import org.spongepowered.api.block.tileentity.TileEntity;
import org.spongepowered.api.data.type.DyeColor;
import org.spongepowered.api.data.value.mutable.Value;
import us.illyohs.botanicalsponge.api.data.BotanicalKeys;
import us.illyohs.botanicalsponge.api.data.mutable.tileentity.PoolData;

public interface TilePool extends TileEntity {

    default PoolData getPoolData() {
        return get(PoolData.class).get();
    }

    default Value<Integer> manaAmount() {
        return getValue(BotanicalKeys.MANA_AMOUNT).get();
    }

    default Value<Integer> manaCap() {
        return getValue(BotanicalKeys.MANA_CAP).get();
    }

    default Value<Integer> manaOutput() {
        return getValue(BotanicalKeys.MANA_OUTPUT).get();
    }

    default Value<DyeColor> getColor() {
        return getValue(BotanicalKeys.COLORS).get();
    }

    default Value<Boolean> canAccept() {
        return getValue(BotanicalKeys.CAN_ACCEPT).get();
    }

    default Value<Boolean> canSpare() {
        return getValue(BotanicalKeys.CAN_SPARE).get();
    }
}
