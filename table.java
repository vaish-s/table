//Author  : Vaishnavi Sheoran.
//Date      : 12/03/2020.
//Purpose: Printing the table of any number.


import java.io.*;
class table
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c;
System.out.println("Input a number");
a=Integer.parseInt(br.readLine());
System.out.println("\n\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f");
for(c=1;c<=9;c++)
{
b=a*c;
System.out.println(a+"  x  "+c+"  =  "+b);
}
System.out.println(a+"  x  10 =  "+a*10);
System.out.println("\n\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f\f");
}
}

import java.io.*;
public class Nbulb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m, i, j, counter = 0;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        for (i = 1; i <= n; i++)
        {
            counter = 0;
            for (j = 1; j <= m; j++)
            {
                if ((i % j) == 0)
                {
                    counter++;
                }
            }
            if (counter % 2 != 0)
             {
                System.out.print("\t" + i);
            }
        }
    }
}
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
function myNavbar(props) {
  return (
    <Navbar bg="light" expand="lg">
      <Container>
        <Navbar.Brand href="#home">{props.title}</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="#home">Home</Nav.Link>
            <Nav.Link href="#link">{props.aboutText}</Nav.Link>
            
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export default myNavbar;

// Navbar.propTypes = {
//     title: propTypes.string,
//     aboutText: propTypes.string
// }

Navbar.defaultProps = {
    title: "Set title here",
    aboutText: "About here"
};
