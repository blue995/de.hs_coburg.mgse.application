import {FileNode} from '../models/file-node';
import {Injectable} from '@angular/core';
import {BehaviorSubject} from 'rxjs';

import { FileNode } from '../models/file-node';

const TREE_DATA = `
  {
    "Informatik": {
      "Bachelor": {
        "SPO B IF 3": "Informatik (Bachelorstudiengang; gültig für Studienanfänger ab dem 01.10.2014)",
        "SPO B IF 2": "Informatik (Bachelorstudiengang; gültig für Studienanfänger vor dem 01.10.2014)"
      },
      "Master": {
        "SPO B IF 3": "Informatik (Bachelorstudiengang; gültig für Studienanfänger ab dem 01.10.2014)",
        "SPO B IF 2": "Informatik (Bachelorstudiengang; gültig für Studienanfänger vor dem 01.10.2014)"
      }
    },
    "Elektrotechnik": {
      "Bachelor": {
        "SPO B ET 3": "Elektrotechnik (Bachelorstudiengang; gültig für Studienanfänger ab dem 01.10.2014)",
        "SPO B ET 2": "Elektrotechnik (Bachelorstudiengang; gültig für Studienanfänger vor dem 01.10.2014)"
      },
      "Master": {
        "SPO B ET 3": "Elektrotechnik (Bachelorstudiengang; gültig für Studienanfänger ab dem 01.10.2014)",
        "SPO B ET 2": "Elektrotechnik (Bachelorstudiengang; gültig für Studienanfänger vor dem 01.10.2014)"
      }
    },
    "Betriebswirtschaftslehre": {
      "Bachelor": {
        "SPO B BWL 3": "Betriebswirtschaftslehre (Bachelorstudiengang; gültig für Studienanfänger ab dem 01.10.2014)",
        "SPO B BWL 2": "Betriebswirtschaftslehre (Bachelorstudiengang; gültig für Studienanfänger vor dem 01.10.2014)"
      },
      "Master": {
        "SPO B BWL 3": "Betriebswirtschaftslehre (Bachelorstudiengang; gültig für Studienanfänger ab dem 01.10.2014)",
        "SPO B BWL 2": "Betriebswirtschaftslehre (Bachelorstudiengang; gültig für Studienanfänger vor dem 01.10.2014)"
      }
    },
    "Soziale Arbeit": {
      "Bachelor": {
        "SPO B Sozi 3": "Soziale Arbeit (Bachelorstudiengang; gültig für Studienanfänger ab dem 01.10.2014)",
        "SPO B Sozi 2": "Soziale Arbeit (Bachelorstudiengang; gültig für Studienanfänger vor dem 01.10.2014)"
      },
      "Master": {
        "SPO B Sozi 3": "Soziale Arbeit (Bachelorstudiengang; gültig für Studienanfänger ab dem 01.10.2014)",
        "SPO B Sozi 2": "Soziale Arbeit (Bachelorstudiengang; gültig für Studienanfänger vor dem 01.10.2014)"
      }
    }
  }`;

@Injectable()
export class FileDatabase {
  dataChange: BehaviorSubject<FileNode[]> = new BehaviorSubject<FileNode[]>([]);

  get data(): FileNode[] { return this.dataChange.value; }

  constructor() {
    this.initialize();
  }

  initialize() {
    // Parse the string to json object.
    const dataObject = JSON.parse(TREE_DATA);

    // Build the tree nodes from Json object. The result is a list of `FileNode` with nested
    //     file node as children.
    const data = this.buildFileTree(dataObject, 0);

    // Notify the change.
    this.dataChange.next(data);
  }

  /**
   * Build the file structure tree. The `value` is the Json object, or a sub-tree of a Json object.
   * The return value is the list of `FileNode`.
   */
  buildFileTree(value: any, level: number): FileNode[] {
    let data: any[] = [];
    for (let k in value) {
      let v = value[k];
      let node = new FileNode();
      node.filename = `${k}`;
      if (v === null || v === undefined) {
        // no action
      } else if (typeof v === 'object') {
        node.children = this.buildFileTree(v, level + 1);
      } else {
        node.type = v;
      }
      data.push(node);
    }
    return data;
  }
}
