# Scrolling Text

A little demo for printing animated text to the console using Cats Effect.

## Run Scratch File

`./mill run`

## Example

```scala
import scrollingtext.*

"""hello,
  |world!"""
  .stripMargin
  .scroll()
```
