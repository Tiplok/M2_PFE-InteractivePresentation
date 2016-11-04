package views

object IndexView {
  import scalatags.Text.all._
  import scalatags.Text.tags2.section
  import scalatags.Text.tags2.title

  def apply(message: String) = {
    Seq(html(
  head(
    meta(charset := "utf-8"),
    meta(name := "viewport", content := "width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"),
    meta(name := "description", content := "Une présentation exemple en HTML5 avec le framework Reveal.js"),
    meta(name := "author", content := "Rahal Badr & Nicolas Vasseur"),

    title("Présentation exemple avec reveal.js"),

    link(rel := "stylesheet", href := "assets/stylesheets/reveal.css"),
    link(rel := "stylesheet", href := "assets/stylesheets/theme/blood.css"),
    link(rel := "stylesheet", href := "assets/stylesheets/lib/zenburn.css")
    ),

body(
    div(`class` := "reveal",

    div(`class` := "slides",

      section(h1("Welcome")),

      section(

        section(

          h2("Collaborator Number 1"),

          br,

          h3("Nicolas Vasseur", a(attr("href") := "https://github.com/Tiplok", "Tiplok")),

          p(small("Master 2 e-services"))

        ),

        section(h2("Who Am I ?"),

          p("My name is Nicolas, I'm 22 and I live in Tourcoing, Northern France.")

        ),

        section(h2("What's my story ?"),

          p("I was born in Tourcoing, city in the north of France. I always live around this place.")

        ),

        section(h2("Academic background"),

          ul(

            li("2012 : Bachelor of Engineering Science"),

            li("2014 : Technology University Degree"),

            li("2015 : Licence Degree in Computer Science"),

            li("Currently : Master 2 in electronic services")

          )

        )

      ),

      section(

        section(h2("Collaborator Number 2"),

          br,

          h3("Rahal Badr", a(attr("href") := "https://github.com/rbadr", "rbadr")),

          p(small("Master 2 IAGL : Infrastructures Applicatives et Génie Logiciel"))

        ),

        section(h2("Who Am I ?"),

          p("My name is Badr, I'm 24 years old and I Live in Lille, Northern France.")

        ),

        section(h2("What's my story ?"),

          p("I was born in Rabat, the capital of Morocco. I lived there untill my 22nd birthday.")

        ),

        section(h2("Why did I leave ?"),

          p(

            """I got my Licence degree in Computer science and mathematics, then I decided it was time to look for new opportunities abroad.

            I lived for half a year in Reims, then I moved to Paris for a 5 months internship, and now here I am in Lille.""")

        ),

        section(h2("Academic Background"),

          ul(

            li("2010 : Bachelor in mathematical science, Rabat-Morocco."),

            li("2014 : Licence Degree in mathematics and computer science, Rabat-Morocco."),

            li("2015 : Master 1 Degree in computer science, Reims-France."),

            li("Currently : Master 2 in software engineering, Lille-France")

          )

        ),

        section(h2("What do I love in life?"),

          p(

            """I love traveling and meeting new people from different cultures, that's the reason I joined an international association when I moved to Lille,

            I wanted to meet new friends from all over europe. I love discovering new cultures."""),

          p(a(attr("href") := "#/5", "Go Back Up"))

        )

      ),

      section(attr("data-background") := "http://i.giphy.com/90F8aUepslB84.gif",

        h2("What a DUO!")

      ),

      section(css("text-align") := "left",

        h1("THE END"),

        p(a(attr("href") := "https://github.com/rbadr/PFENicolas-Badr", "Our Repo in Github"))

      )

    )

  ),
          script(src := "assets/javascripts/lib/head.min.js")),
          script(src := "assets/javascripts/reveal.js"))
    )
  }

}
