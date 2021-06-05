/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.terheyden.bench;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import com.terheyden.str.Str;

@OutputTimeUnit(TimeUnit.SECONDS)
@BenchmarkMode({ Mode.Throughput })
@Warmup(iterations = 5)
@Fork(value = 1)
@State(Scope.Benchmark)
public class MyBenchmark {

    private static final int LOOPS = 10_000;

    @Benchmark
    public int pluses() {

        UUID uuid = UUID.randomUUID();
        String name = uuid.toString();
        int counter = 0;

        for (int i = 0; i < LOOPS; i++) {
            String str = "User ID = " + uuid + " with name " + name + " is " + counter + " years old. Today is the " + counter + " day of the month of " + name + " in the year " + counter + "!";
            counter += str.length();
        }

        return counter;
    }

    @Benchmark
    public int stringFormat() {

        UUID uuid = UUID.randomUUID();
        String name = uuid.toString();
        int counter = 0;

        for (int i = 0; i < LOOPS; i++) {
            String str = String.format("User ID = %s with name %s is %d years old. Today is the %d day of the month of %s in the year %d!", uuid, name, counter, counter, name, counter);
            counter += str.length();
        }

        return counter;
    }

    @Benchmark
    public int strFormat() {

        UUID uuid = UUID.randomUUID();
        String name = uuid.toString();
        int counter = 0;

        for (int i = 0; i < LOOPS; i++) {
            String str = Str.format("User ID = {} with name {} is {} years old. Today is the {} day of the month of {} in the year {}!", uuid, name, counter, counter, name, counter);
            counter += str.length();
        }

        return counter;
    }

    @Benchmark
    public int formattedString() {

        UUID uuid = UUID.randomUUID();
        String name = uuid.toString();
        int counter = 0;

        for (int i = 0; i < LOOPS; i++) {
            String str = "User ID = %s with name %s is %d years old. Today is the %d day of the month of %s in the year %d!".formatted(uuid, name, counter, counter, name, counter);
            counter += str.length();
        }

        return counter;
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
            .include(MyBenchmark.class.getSimpleName())
            .forks(1)
            .build();
        new Runner(opt).run();
    }
}
