package pl.poznan.put.gol.game;

import junit.framework.TestCase;

public class ConwaysCellTest extends TestCase {

    public void testNeighbors() {
        ConwaysCell cell = new ConwaysCell(1, 1);
        Cells neighbors = new Cells();
        neighbors.add(new ConwaysCell(0, 0));
        neighbors.add(new ConwaysCell(0, 1));
        neighbors.add(new ConwaysCell(0, 2));
        neighbors.add(new ConwaysCell(1, 0));
        neighbors.add(new ConwaysCell(1, 2));
        neighbors.add(new ConwaysCell(2, 0));
        neighbors.add(new ConwaysCell(2, 1));
        neighbors.add(new ConwaysCell(2, 2));

        assertEquals(neighbors, cell.neighbors());
    }

    public void testEquals(){
        ConwaysCell cell1 = new ConwaysCell(1, 1);
        ConwaysCell cell2 = new ConwaysCell(1, 1);

        assertEquals(cell1, cell2);
    }
}