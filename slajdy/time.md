% Date and Time in Java 



# Intro

* since JDK 8 `java.time`
* pre JDK 8 `java.util.Date` with external libraries like `Joda`

Examples:
```
		Date date = new Date(2019, 11, 16);
		System.out.println(date);
```

```
		Calendar c = Calendar.getInstance();
		c.set(2019,11, 16);
		System.out.println(c.getTime());
```



# Creating Dates and Times

## Date and Time classes

* `Instant` - the simplest timestamp in UTC
* `LocalDate` - a date without a time, nor any reference to an offset or time-zone
* `LocalTime` - a time without a date, nor any reference to an offset or time-zone
* `LocalDateTime` - combines date and time, but still without any offset or time-zone
* `ZonedDateTime` - a "full" date-time with time-zone and resolved offset from UTC/Greenwich


## Date and Time - create

Tasks:

* <a href="time-tasks.html#/zadanie-1" target="_blank">[Task 1]</a>

* <a href="time-tasks.html#/zadanie-2" target="_blank">[Task 2]</a>




## Manipulating Dates and Times

Date and time classes are **immutable**

<table style="font-size: 75%">
<tr><td>

```

plusDays(long)
plusHours(long)
plusMinutes(long)
plusMonths(long)
plusNanos(long)
plusSeconds(long)
plusYears(long)
plusWeeks(long)

plus(long, TemporalUnit)

plus(TemporalAmount)
```

</td>
<td>

```

minusDays(long)
minusHours(long)
minusMinutes(long)
minusMonths(long)
minusNanos(long)
minusSeconds(long)
minusYears(long)
minusWeeks(long)

minus(long, TemporalUnit)

minus(TemporalAmount)
```

</td>
<td>

```
withDayOfMonth(int)
withDayOfYear(int)
withHour(int)
withMinute(int)
withMonth(int)
withNano(int)
withSecond(int)
withYear(int)


with(LocalDate, LocalTime)

with(TemporalAdjuster)

with(TemporalField, long)
```

</td>
</tr>
</table>


## Manipulating Dates and Times

Tasks:

* <a href="time-tasks.html#/zadanie-3" target="_blank">[Task 3]</a>
* <a href="time-tasks.html#/zadanie-4" target="_blank">[Task 4]</a>
* <a href="time-tasks.html#/zadanie-5" target="_blank">[Task 5]</a>

* <a href="time-tasks.html#/zadanie-6" target="_blank">[Task 6]</a>


# Pieces of time

## Period

A Period uses date-based values (years, months, days).

Create:

```
Period.ofDays(int)
Period.ofWeeks(int)
Period.ofMonths(int)
Period.ofYears(int)

Period.of(int years, int months, int days)

```

## Duration

A Duration measures an amount of time using time-based values (seconds, nanoseconds). 

Create:
```
Duration.ofDays(int)
Duration.ofHours(int)
Duration.ofMinutes(int)
Duration.ofSeconds(int)
Duration.ofSeconds(long seconds, )
Period.ofWeeks(int)
Period.ofMonths(int)
Period.ofYears(int)

Period.of(int years, int months, int days)

```

## ChronoUnit

<div style="font-size: 60%">
* `NANOS` - a nanosecond, the smallest supported unit of time.
* `MICROS` -  a microsecond.
* `MILLIS` -  a millisecond.
* `SECONDS` - a second.
* `MINUTES` - a minute.
* `HOURS` - an hour.
* `HALF_DAYS` - half a day, as used in AM/PM.
* `DAYS` - a day.
* `MONTHS` -  a month.
* `WEEKS` - a week.
* `YEARS` - a year.
* `DECADES` - a decade.
* `CENTURIES` - a century.
* `MILLENNIA` - a millennium.
* `ERAS` -  an era.
* `FOREVER` - artificial unit forever.
</div>

## Time pieces - tasks


Tasks:

* <a href="time-tasks.html#/zadanie-7" target="_blank">[Task 7]</a>
* <a href="time-tasks.html#/zadanie-8" target="_blank">[Task 8]</a>
* <a href="time-tasks.html#/zadanie-9" target="_blank">[Task 9]</a>
* <a href="time-tasks.html#/zadanie-10" target="_blank">[Task 10]</a>


# Format and Parse

## Formatting

* get data out of date/time

* `DateTimeFormatter`

<a href="https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html" target="_blank">[reference]</a>



## Parsing


Default:
```
dateTime.parse(String)
``` 

Using formatter:
```
dateTime.parse(String, DateTimeFormatter)
```

# Time zones and Daylight saving time


## Time zones 

* `ZonedDateTime`
* `OffsetDateTime`

## Daylight saving time


## Time zones - tasks


* <a href="time-tasks.html#/zadanie-11" target="_blank">[Task 11]</a>
* <a href="time-tasks.html#/zadanie-12" target="_blank">[Task 12]</a>
* <a href="time-tasks.html#/zadanie-13" target="_blank">[Task 13]</a>
* <a href="time-tasks.html#/zadanie-14" target="_blank">[Task 14]</a>
* <a href="time-tasks.html#/zadanie-15" target="_blank">[Task 15]</a>
* <a href="time-tasks.html#/zadanie-16" target="_blank">[Task 16]</a>


# Other 

## Other calendar systems

* `HijrahDate` 

* `ThaiBuddhistDate`

* `JapaneseDate` e.g. `Heisei 31` - <a href="https://en.wikipedia.org/wiki/Heisei" target="_blank">Heisei</a> vs <a href="https://en.wikipedia.org/wiki/Reiwa" target="_blank">Reiwa</a>

* `MinguoDate` - Taiwan

<a href="time-tasks.html#/zadanie-17" target="_blank">[Task 17]</a>


## Leap second

Not supported by `java.time`.

<a href="https://en.wikipedia.org/wiki/%CE%94T" target="_blank">ΔT</a>




# The end