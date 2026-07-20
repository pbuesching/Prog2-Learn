Klar. Wenn du die Pattern **wirklich** für die Klausur lernen willst, würde ich die Aufgaben so aufbauen, dass sie von leicht nach schwer werden. Versuche jede Aufgabe erst selbst zu lösen. Wenn du fertig bist oder nicht weiterkommst, kannst du mir deinen Code schicken und ich gebe dir Feedback wie ein Korrektor.

---

# 1. Observer (leicht)

### Aufgabe 1: Wetterstation

Eine Wetterstation misst die Temperatur.

* Erstelle eine Klasse `WeatherStation`.
* Sie speichert die aktuelle Temperatur.
* Andere Objekte können sich als Beobachter anmelden oder abmelden.
* Immer wenn sich die Temperatur ändert, werden alle Beobachter informiert.

Es gibt zwei Observer:

* `PhoneDisplay`
* `WindowDisplay`

Beide geben die neue Temperatur auf der Konsole aus.

Beispiel:

```
Temperatur geändert: 24°C

Phone:
Neue Temperatur: 24°C

Window:
Neue Temperatur: 24°C
```

**Zusatz:**
Lass den `WindowDisplay` sich nach der ersten Benachrichtigung wieder abmelden.

---

# 2. Observer (mittel)

### Aufgabe 2: YouTube-Kanal

Ein YouTube-Kanal lädt Videos hoch.

Subscriber können:

* abonnieren
* kündigen

Beim Hochladen eines Videos erhalten alle Abonnenten eine Nachricht.

Beispiel:

```
Neues Video:
Observer Pattern erklärt!

Max wurde benachrichtigt.
Lisa wurde benachrichtigt.
Tom wurde benachrichtigt.
```

---

# 3. Template Method (leicht)

### Aufgabe 3: Getränke

Es gibt verschiedene Getränke.

Jedes Getränk wird so hergestellt:

```
Wasser erhitzen
Zutaten hinzufügen
Umrühren
In Tasse füllen
```

Nur der Schritt

```
Zutaten hinzufügen
```

ist unterschiedlich.

Implementiere

* Tea
* Coffee

---

# 4. Template Method (mittel)

### Aufgabe 4: Computerspiel starten

Alle Spiele starten nach folgendem Ablauf:

```
Spiel laden
Spiel initialisieren
Spiel spielen
Spiel beenden
```

Nur

```
Spiel spielen
```

ist unterschiedlich.

Erstelle

* Minecraft
* Tetris

---

# 5. Visitor (leicht)

### Aufgabe 5: Zoo

Es gibt

* Lion
* Elephant
* Monkey

Jedes Tier besitzt

```
accept(Visitor)
```

Erstelle zwei Visitor:

### SoundVisitor

Ausgabe:

```
Lion -> Roar
Elephant -> Töröö
Monkey -> Uga Uga
```

### FeedVisitor

Ausgabe:

```
Lion bekommt Fleisch.
Elephant bekommt Heu.
Monkey bekommt Bananen.
```

---

# 6. Visitor (mittel)

### Aufgabe 6: Computerteile

Es gibt

* CPU
* GPU
* RAM

Visitor:

### PriceVisitor

Berechnet den Gesamtpreis.

### EnergyVisitor

Berechnet den Stromverbrauch.

Beispiel:

```
CPU: 200€
GPU: 500€
RAM: 100€

Gesamt:
800€
```

---

# 7. Command (leicht)

### Aufgabe 7: Lampe

Eine Lampe besitzt

```
turnOn()
turnOff()
```

Erstelle Commands:

* TurnOnCommand
* TurnOffCommand

Ein `RemoteControl` besitzt

```
pressButton()
```

Je nachdem welcher Command gesetzt wurde, wird die Lampe an- oder ausgeschaltet.

---

# 8. Command (mittel)

### Aufgabe 8: Musikplayer

Ein Musikplayer besitzt

```
play()
pause()
stop()
```

Erstelle jeweils passende Commands.

Der Benutzer kann verschiedene Buttons drücken.

---

# 9. Command (schwer)

### Aufgabe 9: Texteditor mit Undo

Ein Texteditor besitzt

```
append(String)
deleteLast()
```

Commands:

* AppendCommand
* DeleteCommand

Zusätzlich:

Ein `CommandManager`

```
execute(command)

undo()
```

soll die letzten Befehle rückgängig machen können.

---

# 10. Kombinationsaufgabe (Klausurniveau)

Ein Zoo besitzt Tiere.

* Neue Tiere können hinzugefügt werden.
* Besucher beobachten den Zoo (Observer).
* Ein Tierpfleger läuft mit einem Visitor durch alle Tiere und füttert sie.
* Jeder Fütterungsvorgang wird als Command gespeichert und kann rückgängig gemacht werden.

Hier werden alle vier Pattern kombiniert.

---

## Bonus: Pattern erkennen (typische Klausurfrage)

Überlege bei jeder Beschreibung, welches Pattern gemeint ist:

1. Ein Objekt informiert automatisch alle angemeldeten Objekte über Änderungen.
2. Der allgemeine Ablauf ist fest vorgegeben, einzelne Schritte werden von Unterklassen implementiert.
3. Neue Operationen sollen hinzugefügt werden, ohne bestehende Klassen zu verändern.
4. Eine Aktion soll als Objekt gespeichert werden und später ausführbar oder rückgängig machbar sein.

**Lösung:**

1. Observer
2. Template Method
3. Visitor
4. Command

## Lerntipp

Falls eure Klausur ähnlich aufgebaut ist wie viele Programmieren-2-Klausuren, würde ich diese Reihenfolge empfehlen:

1. Observer (einfachstes Pattern)
2. Template Method
3. Command
4. Visitor (meist das anspruchsvollste, weil Double Dispatch verstanden werden muss)

Wenn du diese vier Pattern aus dem Kopf implementieren kannst – inklusive Interfaces, abstrakter Klassen und der Zusammenarbeit der Klassen – bist du für die meisten Programmieren-2-Klausuren in diesem Themenbereich sehr gut vorbereitet.
